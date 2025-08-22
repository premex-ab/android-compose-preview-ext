package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Creato device specifications for Android Compose previews.
 *
 * This extension provides Creato device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Creato.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Creato: Any
  get() = object {
      /** Creato mdt1005_mk_32 */
      val MDT1005_MK_32 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
