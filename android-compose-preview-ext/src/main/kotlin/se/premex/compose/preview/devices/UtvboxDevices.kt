package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * UTVbox device specifications for Android Compose previews.
 *
 * This extension provides UTVbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Utvbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Utvbox: Any
  get() = object {
      /** UTVbox MGV2002_HK */
      val MGV2002_HK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
