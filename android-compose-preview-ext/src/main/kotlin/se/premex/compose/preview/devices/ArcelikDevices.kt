package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * arcelik device specifications for Android Compose previews.
 *
 * This extension provides arcelik device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Arcelik.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Arcelik: Any
  get() = object {
      /** arcelik arcelik_eu */
      val ARCELIK_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
