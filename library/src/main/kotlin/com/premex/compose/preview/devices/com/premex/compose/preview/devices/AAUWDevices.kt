package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AAUW device specifications for Android Compose previews.
 *
 * This extension provides AAUW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AAUW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AAUW: Any
  get() = object {
      /** DeviceSpec(manufacturer=AAUW, code=M50, width=1200, height=2000, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=M50, width=1200,
      height=2000, dpi=260, isGoogleDevice=false).code */
      val M50 = "spec:width=1200,height=2000,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=AAUW, code=M50_NEW, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=M50_NEW, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val M50_NEW = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AAUW, code=M60_NEW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=M60_NEW, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val M60_NEW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AAUW, code=T10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=T10, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AAUW, code=T50_2023, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=T50_2023, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T50_2023 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AAUW, code=T60Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=T60Pro, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T60PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AAUW, code=T60Pro_2023, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=T60Pro_2023, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T60PRO_2023 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AAUW, code=T60PRO_ROW, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=T60PRO_ROW, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val T60PRO_ROW = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AAUW, code=T90, width=1200, height=1920, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=T90, width=1200,
      height=1920, dpi=272, isGoogleDevice=false).code */
      val T90 = "spec:width=1200,height=1920,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=AAUW, code=T_50, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AAUW, code=T_50, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T_50 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
