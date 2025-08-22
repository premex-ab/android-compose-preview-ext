package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPARK device specifications for Android Compose previews.
 *
 * This extension provides SPARK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SPARK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPARK: Any
  get() = object {
      /** DeviceSpec(manufacturer=SPARK, code=Spark_Plus_3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPARK, code=Spark_Plus_3,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SPARK_PLUS_3 = "spec:width=480,height=960,unit=px,dpi=240"

  }
