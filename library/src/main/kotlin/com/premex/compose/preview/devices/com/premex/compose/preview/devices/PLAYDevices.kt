package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PLAY device specifications for Android Compose previews.
 *
 * This extension provides PLAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PLAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PLAY: Any
  get() = object {
      /** DeviceSpec(manufacturer=PLAY, code=dctiw362p, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLAY, code=dctiw362p, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DCTIW362P = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PLAY, code=DV8545-PLAY, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLAY, code=DV8545-PLAY, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8545_PLAY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PLAY, code=DV8945-KPP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLAY, code=DV8945-KPP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8945_KPP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PLAY, code=DV8990-KPP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLAY, code=DV8990-KPP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8990_KPP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
