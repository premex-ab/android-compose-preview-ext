package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * XD device specifications for Android Compose previews.
 *
 * This extension provides XD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xd: Any
  get() = object {
      /** XD martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

  }
