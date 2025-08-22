package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HOMII device specifications for Android Compose previews.
 *
 * This extension provides HOMII device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Homii.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Homii: Any
  get() = object {
      /** HOMII M6 */
      val M6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** HOMII XBOOK */
      val XBOOK = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMII Xbookkids */
      val XBOOKKIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMII XBOOK_12 */
      val XBOOK_12 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOMII Xbook_Plus */
      val XBOOK_PLUS = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** HOMII XBOOK_PRO */
      val XBOOK_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
