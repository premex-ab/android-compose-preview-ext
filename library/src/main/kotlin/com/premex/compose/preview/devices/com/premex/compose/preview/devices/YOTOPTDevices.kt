package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YOTOPT device specifications for Android Compose previews.
 *
 * This extension provides YOTOPT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YOTOPT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YOTOPT: Any
  get() = object {
      /** DeviceSpec(manufacturer=YOTOPT, code=Q11-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=Q11-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Q11_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YOTOPT, code=X109, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=X109, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X109 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YOTOPT, code=Y103_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=Y103_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y103_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YOTOPT, code=Y121-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=Y121-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y121_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YOTOPT, code=Y3-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=Y3-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Y3_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YOTOPT, code=Y61, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=Y61, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Y61 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YOTOPT, code=Y61-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=Y61-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Y61_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YOTOPT, code=Y8-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOTOPT, code=Y8-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val Y8_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
