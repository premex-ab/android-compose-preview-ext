package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OASE device specifications for Android Compose previews.
 *
 * This extension provides OASE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oase.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oase: Any
  get() = object {
      /** OASE EL-P1 */
      val EL_P1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
