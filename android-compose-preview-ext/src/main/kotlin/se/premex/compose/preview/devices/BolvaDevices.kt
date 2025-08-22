package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BOLVA device specifications for Android Compose previews.
 *
 * This extension provides BOLVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bolva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bolva: Any
  get() = object {
      /** BOLVA B_TAB1021 */
      val B_TAB1021 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
