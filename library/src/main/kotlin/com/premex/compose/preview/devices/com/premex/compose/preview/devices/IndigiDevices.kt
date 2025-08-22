package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * indigi device specifications for Android Compose previews.
 *
 * This extension provides indigi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Indigi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Indigi: Any
  get() = object {
      /** DeviceSpec(manufacturer=indigi, code=G4i, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=indigi, code=G4i, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val G4I = "spec:width=600,height=1024,unit=px,dpi=213"

  }
