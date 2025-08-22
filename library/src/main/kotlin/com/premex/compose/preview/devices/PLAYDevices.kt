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
      /** PLAY dctiw362p */
      val DCTIW362P = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PLAY DV8545-PLAY */
      val DV8545_PLAY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PLAY DV8945-KPP */
      val DV8945_KPP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PLAY DV8990-KPP */
      val DV8990_KPP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
