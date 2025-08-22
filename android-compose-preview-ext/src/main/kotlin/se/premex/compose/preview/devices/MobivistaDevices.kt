package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MobiVista device specifications for Android Compose previews.
 *
 * This extension provides MobiVista device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobivista.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobivista: Any
  get() = object {
      /** MobiVista MVT_1001 */
      val MVT_1001 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
