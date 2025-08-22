package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BLACKANDDECKER device specifications for Android Compose previews.
 *
 * This extension provides BLACKANDDECKER device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackanddecker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackanddecker: Any
  get() = object {
      /** BLACKANDDECKER R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
