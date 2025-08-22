package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GDL device specifications for Android Compose previews.
 *
 * This extension provides GDL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gdl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gdl: Any
  get() = object {
      /** GDL G200 */
      val G200 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** GDL GigaX_Y21 */
      val GIGAX_Y21 = "spec:width=720,height=1650,unit=px,dpi=320"

      /** GDL Y30 */
      val Y30 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
