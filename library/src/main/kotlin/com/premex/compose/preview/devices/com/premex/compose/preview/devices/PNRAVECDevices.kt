package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PN_RAVEC device specifications for Android Compose previews.
 *
 * This extension provides PN_RAVEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PNRAVEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PNRAVEC: Any
  get() = object {
      /** DeviceSpec(manufacturer=PN_RAVEC, code=PN_RAVEC_TABLETTE, width=1200, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PN_RAVEC,
      code=PN_RAVEC_TABLETTE, width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PN_RAVEC_TABLETTE = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
