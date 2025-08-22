package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PL_TMPL device specifications for Android Compose previews.
 *
 * This extension provides PL_TMPL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PlTmpl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PlTmpl: Any
  get() = object {
      /** PL_TMPL KSTB6077 */
      val KSTB6077 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
