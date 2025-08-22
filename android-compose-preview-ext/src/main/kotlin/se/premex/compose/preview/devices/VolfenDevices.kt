package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VOLFEN device specifications for Android Compose previews.
 *
 * This extension provides VOLFEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Volfen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Volfen: Any
  get() = object {
      /** VOLFEN NEXO_TAB_10A */
      val NEXO_TAB_10A = "spec:width=600,height=1024,unit=px,dpi=210"

  }
