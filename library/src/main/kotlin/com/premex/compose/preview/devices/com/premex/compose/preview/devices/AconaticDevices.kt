package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aconatic device specifications for Android Compose previews.
 *
 * This extension provides Aconatic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aconatic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aconatic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Aconatic, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aconatic, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Aconatic, code=OD0M_EA_T32, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aconatic, code=OD0M_EA_T32,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Aconatic, code=takao, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Aconatic, code=takao, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAKAO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
