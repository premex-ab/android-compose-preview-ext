package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AOSKEY device specifications for Android Compose previews.
 *
 * This extension provides AOSKEY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aoskey.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aoskey: Any
  get() = object {
      /** AOSKEY F11 */
      val F11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AOSKEY P21 */
      val P21 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
