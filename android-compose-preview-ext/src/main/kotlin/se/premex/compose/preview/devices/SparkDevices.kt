package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SPARK device specifications for Android Compose previews.
 *
 * This extension provides SPARK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spark: Any
  get() = object {
      /** SPARK Spark_Plus_3 */
      val SPARK_PLUS_3 = "spec:width=480,height=960,unit=px,dpi=240"

  }
