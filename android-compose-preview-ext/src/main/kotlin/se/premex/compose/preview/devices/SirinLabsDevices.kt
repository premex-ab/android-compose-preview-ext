package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SIRIN_LABS device specifications for Android Compose previews.
 *
 * This extension provides SIRIN_LABS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SirinLabs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SirinLabs: Any
  get() = object {
      /** SIRIN_LABS SR00300-W */
      val SR00300_W = "spec:width=1080,height=2160,unit=px,dpi=420"

  }
