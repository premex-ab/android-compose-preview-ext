package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOOZO device specifications for Android Compose previews.
 *
 * This extension provides HOOZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOOZO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOOZO: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOOZO, code=F13, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=F13, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F13 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=F13_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=F13_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F13_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=HZ0010, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=HZ0010, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val HZ0010 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOOZO, code=HZ0010J, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=HZ0010J, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val HZ0010J = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOOZO, code=HZ0011, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=HZ0011, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val HZ0011 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOOZO, code=HZ1012, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=HZ1012, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HZ1012 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=KTLA133, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=KTLA133, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KTLA133 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=MA768, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=MA768, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MA768 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=MBR05, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=MBR05, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MBR05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=MBR05_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=MBR05_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MBR05_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=MID, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=MID, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=MZ10863W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=MZ10863W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MZ10863W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HOOZO, code=MZS10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=MZS10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MZS10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HOOZO, code=YK_P30, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=YK_P30, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val YK_P30 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOOZO, code=YK_P30_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOOZO, code=YK_P30_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val YK_P30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
