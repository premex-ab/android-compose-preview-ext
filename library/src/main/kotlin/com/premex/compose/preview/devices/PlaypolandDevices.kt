package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PlayPoland device specifications for Android Compose previews.
 *
 * This extension provides PlayPoland device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Playpoland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Playpoland: Any
  get() = object {
      /** PlayPoland PLAY_BOX_TV_4B */
      val PLAY_BOX_TV_4B = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
