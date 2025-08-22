package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VEIDOO device specifications for Android Compose previews.
 *
 * This extension provides VEIDOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Veidoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Veidoo: Any
  get() = object {
      /** VEIDOO VEIDOO_T30_PLUS */
      val VEIDOO_T30_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VEIDOO VEIDOO_T8 */
      val VEIDOO_T8 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
