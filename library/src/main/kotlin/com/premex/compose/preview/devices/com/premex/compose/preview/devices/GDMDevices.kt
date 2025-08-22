package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GDM device specifications for Android Compose previews.
 *
 * This extension provides GDM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GDM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GDM: Any
  get() = object {
      /** DeviceSpec(manufacturer=GDM, code=MB10, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GDM, code=MB10, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val MB10 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GDM, code=P4R, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GDM, code=P4R, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P4R = "spec:width=720,height=1520,unit=px,dpi=320"

  }
