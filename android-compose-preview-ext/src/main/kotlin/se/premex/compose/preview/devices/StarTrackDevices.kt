package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STAR-TRACK device specifications for Android Compose previews.
 *
 * This extension provides STAR-TRACK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StarTrack.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StarTrack: Any
  get() = object {
      /** STAR-TRACK lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
