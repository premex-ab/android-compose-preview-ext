package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hipstreet-LYF device specifications for Android Compose previews.
 *
 * This extension provides Hipstreet-LYF device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HipstreetLYF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HipstreetLYF: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hipstreet-LYF, code=LS-4004, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hipstreet-LYF, code=LS-4004,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val LS_4004 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hipstreet-LYF, code=LS-5017, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hipstreet-LYF, code=LS-5017,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val LS_5017 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
