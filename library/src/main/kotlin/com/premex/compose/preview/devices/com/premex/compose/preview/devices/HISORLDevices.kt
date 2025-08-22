package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HISORL device specifications for Android Compose previews.
 *
 * This extension provides HISORL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HISORL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HISORL: Any
  get() = object {
      /** DeviceSpec(manufacturer=HISORL, code=P50, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=P50, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P50 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HISORL, code=P80-EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=P80-EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HISORL, code=P80-ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=P80-ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P80_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HISORL, code=T10P, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=T10P, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HISORL, code=T901_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=T901_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T901_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HISORL, code=T901_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=T901_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T901_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HISORL, code=TAB10_ROW, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=TAB10_ROW, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB10_ROW = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=HISORL, code=TAB_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=TAB_10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HISORL, code=TB02_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=TB02_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TB02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HISORL, code=TB02_ROW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=TB02_ROW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TB02_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HISORL, code=Y101P, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HISORL, code=Y101P, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Y101P = "spec:width=600,height=1024,unit=px,dpi=160"

  }
