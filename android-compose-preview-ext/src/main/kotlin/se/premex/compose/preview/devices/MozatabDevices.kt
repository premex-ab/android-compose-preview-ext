package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * mozaTab device specifications for Android Compose previews.
 *
 * This extension provides mozaTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mozatab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mozatab: Any
  get() = object {
      /** mozaTab MTN_E1 */
      val MTN_E1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
