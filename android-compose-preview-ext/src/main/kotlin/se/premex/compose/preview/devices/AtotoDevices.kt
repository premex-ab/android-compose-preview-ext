package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ATOTO device specifications for Android Compose previews.
 *
 * This extension provides ATOTO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Atoto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Atoto: Any
  get() = object {
      /** ATOTO Multifunctional_Tablet */
      val MULTIFUNCTIONAL_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

  }
