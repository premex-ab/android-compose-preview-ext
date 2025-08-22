package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VOLIA device specifications for Android Compose previews.
 *
 * This extension provides VOLIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Volia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Volia: Any
  get() = object {
      /** VOLIA VOL001 */
      val VOL001 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
