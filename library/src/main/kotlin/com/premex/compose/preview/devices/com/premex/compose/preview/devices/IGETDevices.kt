package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iGET device specifications for Android Compose previews.
 *
 * This extension provides iGET device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IGET.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IGET: Any
  get() = object {
      /** DeviceSpec(manufacturer=iGET, code=iGET_SMART_G101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=iGET_SMART_G101,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IGET_SMART_G101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=iGET_SMART_G102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=iGET_SMART_G102,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IGET_SMART_G102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=iGET_SMART_L102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=iGET_SMART_L102,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IGET_SMART_L102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_G81, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_G81, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_G81 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_G81H, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_G81H, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_G81H = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L103, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L103, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_L103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L104_eea, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L104_eea,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_L104_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L11, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L11, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val SMART_L11 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L206, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L206, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val SMART_L206 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L20X, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L20X, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SMART_L20X = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L30, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L30, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SMART_L30 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L31, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L31, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SMART_L31 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iGET, code=SMART_L32, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_L32, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SMART_L32 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_W101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W10X_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W10X_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_W10X_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W202, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W202, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_W202 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W203, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W203, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_W203 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W20X, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W20X, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SMART_W20X = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W30_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W30_EEA,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val SMART_W30_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W31_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W31_EEA,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val SMART_W31_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W32, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W32, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val SMART_W32 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W84_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W84_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SMART_W84_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W8X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W8X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SMART_W8X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=iGET, code=SMART_W8_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iGET, code=SMART_W8_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SMART_W8_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

  }
