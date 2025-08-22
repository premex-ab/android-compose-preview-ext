package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIGICEL device specifications for Android Compose previews.
 *
 * This extension provides DIGICEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIGICEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIGICEL: Any
  get() = object {
      /** DIGICEL DL3 */
      val DL3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DIGICEL DL3Plus */
      val DL3PLUS = "spec:width=720,height=1520,unit=px,dpi=360"

  }
