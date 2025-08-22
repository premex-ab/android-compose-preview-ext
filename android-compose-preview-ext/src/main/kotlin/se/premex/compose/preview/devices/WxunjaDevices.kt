package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WXUNJA device specifications for Android Compose previews.
 *
 * This extension provides WXUNJA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wxunja.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wxunja: Any
  get() = object {
      /** WXUNJA E10 */
      val E10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
