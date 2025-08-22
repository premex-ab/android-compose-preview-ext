package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HELIX_INC device specifications for Android Compose previews.
 *
 * This extension provides HELIX_INC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HELIXINC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HELIXINC: Any
  get() = object {
      /** DeviceSpec(manufacturer=HELIX_INC, code=C-TABLET, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HELIX_INC, code=C-TABLET,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val C_TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
