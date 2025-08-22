package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XMOBILE device specifications for Android Compose previews.
 *
 * This extension provides XMOBILE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XMOBILE: Any
  get() = object {
      /** DeviceSpec(manufacturer=XMOBILE, code=X10Max, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X10Max, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val X10MAX = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=XMOBILE, code=X55NALU, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X55NALU, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val X55NALU = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XMOBILE, code=X55USA, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X55USA, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val X55USA = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XMOBILE, code=X63, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X63, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val X63 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=XMOBILE, code=X63Pro, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X63Pro, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val X63PRO = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=XMOBILE, code=X8Max, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X8Max, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X8MAX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XMOBILE, code=X8Pro, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X8Pro, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val X8PRO = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=XMOBILE, code=X8Pronus, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X8Pronus, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val X8PRONUS = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=XMOBILE, code=XMOBILE, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=XMOBILE, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val XMOBILE = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=XMOBILE, code=Xmobile_X2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=Xmobile_X2,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val XMOBILE_X2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=XMOBILE, code=Xmobile_X2_US, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=Xmobile_X2_US,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val XMOBILE_X2_US = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=XMOBILE, code=Xmovi_X8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=Xmovi_X8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XMOVI_X8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XMOBILE, code=X_55B, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X_55B, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val X_55B = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XMOBILE, code=X_55_A, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X_55_A, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val X_55_A = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XMOBILE, code=X_63_B_ProB, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X_63_B_ProB,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val X_63_B_PROB = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=XMOBILE, code=X_63_ProA, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XMOBILE, code=X_63_ProA, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val X_63_PROA = "spec:width=720,height=1520,unit=px,dpi=280"

  }
