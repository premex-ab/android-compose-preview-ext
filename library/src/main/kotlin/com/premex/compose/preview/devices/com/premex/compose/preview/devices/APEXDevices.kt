package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * APEX device specifications for Android Compose previews.
 *
 * This extension provides APEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.APEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.APEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=APEX, code=APEX_P10HD_PRO, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=APEX_P10HD_PRO,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val APEX_P10HD_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=APEX, code=P10HD_Lite, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=P10HD_Lite, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P10HD_LITE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=APEX, code=R10D, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=R10D, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R10D = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=APEX, code=T40PRO_L1, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=T40PRO_L1, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val T40PRO_L1 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=APEX, code=U10, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=U10, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val U10 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=APEX, code=U10PRO, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=U10PRO, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val U10PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=APEX, code=Z12_PRO, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=Z12_PRO, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val Z12_PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=APEX, code=Z4PRO, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=APEX, code=Z4PRO, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val Z4PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
