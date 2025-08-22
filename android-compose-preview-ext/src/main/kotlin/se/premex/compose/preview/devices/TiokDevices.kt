package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TIOK device specifications for Android Compose previews.
 *
 * This extension provides TIOK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tiok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tiok: Any
  get() = object {
      /** TIOK S32 */
      val S32 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
