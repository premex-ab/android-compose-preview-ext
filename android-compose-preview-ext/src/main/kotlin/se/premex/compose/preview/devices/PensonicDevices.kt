package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PENSONIC device specifications for Android Compose previews.
 *
 * This extension provides PENSONIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pensonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pensonic: Any
  get() = object {
      /** PENSONIC R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PENSONIC R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
