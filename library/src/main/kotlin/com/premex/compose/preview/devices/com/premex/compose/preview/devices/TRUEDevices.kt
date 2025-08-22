package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TRUE device specifications for Android Compose previews.
 *
 * This extension provides TRUE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TRUE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TRUE: Any
  get() = object {
      /** DeviceSpec(manufacturer=TRUE, code=Alpha_5G, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE, code=Alpha_5G, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val ALPHA_5G = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=TRUE, code=SMART_4G_Champion, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE, code=SMART_4G_Champion,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val SMART_4G_CHAMPION = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TRUE, code=SMART_4G_M1_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE, code=SMART_4G_M1_Plus,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val SMART_4G_M1_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TRUE, code=SMART_Champ_4inch, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE, code=SMART_Champ_4inch,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val SMART_CHAMP_4INCH = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TRUE, code=SMART_TAB_4G_e-Biz, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE, code=SMART_TAB_4G_e-Biz,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val SMART_TAB_4G_E_BIZ = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TRUE, code=SMART_TAB_4G_e-Biz_PRO, width=800, height=1280,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE,
      code=SMART_TAB_4G_e-Biz_PRO, width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val SMART_TAB_4G_E_BIZ_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TRUE, code=SMART_TAB_4G_M1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TRUE, code=SMART_TAB_4G_M1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SMART_TAB_4G_M1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
