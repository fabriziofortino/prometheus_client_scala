package io.prometheus.client.scala.internal.counter

import java.util.concurrent.atomic.DoubleAdder

import io.prometheus.client.scala._

/** This represents a Prometheus counter with no labels.
  *
  * A Prometheus counter should be used for values which only increase in value.
  *
  * @param name The name of the counter
  */
final class Counter0(val name: String) extends Collector {
  private[scala] val adder = new DoubleAdder

  def incBy(v: Double): Unit = {
    assert(v >= 0)
    adder.add(v)
  }

  def inc(): Unit = adder.add(1d)

  override def collect(): List[RegistryMetric] =
    RegistryMetric(name, List.empty, adder.sum()) :: Nil

  override def toString: String =
    s"Counter0($name)()"
}