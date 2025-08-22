package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telia device specifications for Android Compose previews.
 *
 * This extension provides Telia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telia: Any
  get() = object {
      /** DeviceSpec(manufacturer=Telia, code=DV8919X-KET, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telia, code=DV8919X-KET,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8919X_KET = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telia, code=DV8919-KLT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telia, code=DV8919-KLT, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8919_KLT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Telia, code=DV8919-KST, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Telia, code=DV8919-KST, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8919_KST = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
