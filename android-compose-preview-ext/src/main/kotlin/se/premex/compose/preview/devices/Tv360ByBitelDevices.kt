package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TV360_by_Bitel device specifications for Android Compose previews.
 *
 * This extension provides TV360_by_Bitel device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tv360ByBitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tv360ByBitel: Any
  get() = object {
      /** TV360_by_Bitel B866V2FAS_Bitel */
      val B866V2FAS_BITEL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
