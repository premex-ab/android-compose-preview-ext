package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Prestigio_Solutions device specifications for Android Compose previews.
 *
 * This extension provides Prestigio_Solutions device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PrestigioSolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PrestigioSolutions: Any
  get() = object {
      /** DeviceSpec(manufacturer=Prestigio_Solutions, code=HE10A3L, width=1200, height=2000,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio_Solutions,
      code=HE10A3L, width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val HE10A3L = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Prestigio_Solutions, code=HP80A33L, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Prestigio_Solutions,
      code=HP80A33L, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HP80A33L = "spec:width=800,height=1280,unit=px,dpi=213"

  }
