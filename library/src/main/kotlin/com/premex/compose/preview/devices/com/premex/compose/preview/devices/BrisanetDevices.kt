package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Brisanet device specifications for Android Compose previews.
 *
 * This extension provides Brisanet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brisanet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brisanet: Any
  get() = object {
      /** DeviceSpec(manufacturer=Brisanet, code=IMTM4000RA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brisanet, code=IMTM4000RA,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val IMTM4000RA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
