package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ITOS device specifications for Android Compose previews.
 *
 * This extension provides ITOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Itos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Itos: Any
  get() = object {
      /** ITOS IC_51 */
      val IC_51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ITOS IC_51R */
      val IC_51R = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ITOS IC_58 */
      val IC_58 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
