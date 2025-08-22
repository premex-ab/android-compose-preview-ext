package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MOBI-SECTV device specifications for Android Compose previews.
 *
 * This extension provides MOBI-SECTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MobiSectv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MobiSectv: Any
  get() = object {
      /** MOBI-SECTV SEI800MOBI */
      val SEI800MOBI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
