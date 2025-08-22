package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TURKCELL device specifications for Android Compose previews.
 *
 * This extension provides TURKCELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TURKCELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TURKCELL: Any
  get() = object {
      /** DeviceSpec(manufacturer=TURKCELL, code=P809T70, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TURKCELL, code=P809T70, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809T70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TURKCELL, code=P839T60, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TURKCELL, code=P839T60, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P839T60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TURKCELL, code=P840F14, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TURKCELL, code=P840F14, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P840F14 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TURKCELL, code=Turkcell_T_Tablet, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TURKCELL, code=Turkcell_T_Tablet,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TURKCELL_T_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

  }
