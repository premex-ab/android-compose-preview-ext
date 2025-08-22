package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HEZIRE device specifications for Android Compose previews.
 *
 * This extension provides HEZIRE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hezire.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hezire: Any
  get() = object {
      /** HEZIRE HBook-Prime */
      val HBOOK_PRIME = "spec:width=800,height=1280,unit=px,dpi=200"

      /** HEZIRE HBook-Pro */
      val HBOOK_PRO = "spec:width=800,height=1280,unit=px,dpi=210"

  }
