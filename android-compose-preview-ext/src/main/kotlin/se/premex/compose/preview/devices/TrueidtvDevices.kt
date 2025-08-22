package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TrueIDTV device specifications for Android Compose previews.
 *
 * This extension provides TrueIDTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trueidtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trueidtv: Any
  get() = object {
      /** TrueIDTV HP4CE-Truevisions */
      val HP4CE_TRUEVISIONS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TrueIDTV SEI600TID */
      val SEI600TID = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
