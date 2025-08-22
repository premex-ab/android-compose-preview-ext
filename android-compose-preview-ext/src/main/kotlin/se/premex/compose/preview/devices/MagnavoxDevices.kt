package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MAGNAVOX device specifications for Android Compose previews.
 *
 * This extension provides MAGNAVOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Magnavox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Magnavox: Any
  get() = object {
      /** MAGNAVOX MMP848 */
      val MMP848 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
