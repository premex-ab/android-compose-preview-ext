package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Infinix device specifications for Android Compose previews.
 *
 * This extension provides Infinix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Infinix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Infinix: Any
  get() = object {
      /** Infinix barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Infinix beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Infinix ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Infinix Infinix-PR652B */
      val INFINIX_PR652B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-PR652C */
      val INFINIX_PR652C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X1101 */
      val INFINIX_X1101 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Infinix Infinix-X1101B */
      val INFINIX_X1101B = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Infinix Infinix-X1102 */
      val INFINIX_X1102 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Infinix Infinix-X5010 */
      val INFINIX_X5010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix_X509 */
      val INFINIX_X509 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix_X510_sprout */
      val INFINIX_X510_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X521 */
      val INFINIX_X521 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X521-Pro */
      val INFINIX_X521_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X522 */
      val INFINIX_X522 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X5511 */
      val INFINIX_X5511 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X5511-13M */
      val INFINIX_X5511_13M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X5514 */
      val INFINIX_X5514 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X5515 */
      val INFINIX_X5515 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X5515F */
      val INFINIX_X5515F = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X5515I */
      val INFINIX_X5515I = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X5516 */
      val INFINIX_X5516 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X5516B */
      val INFINIX_X5516B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X5516C */
      val INFINIX_X5516C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix INFINIX-X552 */
      val INFINIX_X552 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix INFINIX-X552-95M */
      val INFINIX_X552_95M = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix Infinix-X559 */
      val INFINIX_X559 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X559C */
      val INFINIX_X559C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X571 */
      val INFINIX_X571 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix Infinix-X572 */
      val INFINIX_X572 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix Infinix-X573 */
      val INFINIX_X573 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X573B */
      val INFINIX_X573B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix INFINIX-X600-5M */
      val INFINIX_X600_5M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix INFINIX-X600-H533-5M */
      val INFINIX_X600_H533_5M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix Infinix-X603 */
      val INFINIX_X603 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix Infinix-X604_sprout */
      val INFINIX_X604_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Infinix Infinix-X605_sprout */
      val INFINIX_X605_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Infinix Infinix-X606 */
      val INFINIX_X606 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X606B */
      val INFINIX_X606B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X606C */
      val INFINIX_X606C = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X606D */
      val INFINIX_X606D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X608 */
      val INFINIX_X608 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X609 */
      val INFINIX_X609 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X609B */
      val INFINIX_X609B = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Infinix Infinix-X610 */
      val INFINIX_X610 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Infinix Infinix-X612 */
      val INFINIX_X612 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Infinix Infinix-X612B */
      val INFINIX_X612B = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Infinix Infinix-X620 */
      val INFINIX_X620 = "spec:width=1080,height=2260,unit=px,dpi=480"

      /** Infinix Infinix-X622 */
      val INFINIX_X622 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Infinix Infinix-X623 */
      val INFINIX_X623 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Infinix Infinix-X624 */
      val INFINIX_X624 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Infinix Infinix-X624B */
      val INFINIX_X624B = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Infinix Infinix-X625 */
      val INFINIX_X625 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Infinix Infinix-X625C */
      val INFINIX_X625C = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Infinix Infinix-X625D */
      val INFINIX_X625D = "spec:width=720,height=1500,unit=px,dpi=320"

      /** Infinix Infinix-X626 */
      val INFINIX_X626 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Infinix Infinix-X626B */
      val INFINIX_X626B = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Infinix Infinix-X626B-LTE */
      val INFINIX_X626B_LTE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Infinix Infinix-X627STU */
      val INFINIX_X627STU = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Infinix Infinix-X627V */
      val INFINIX_X627V = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Infinix Infinix-X650 */
      val INFINIX_X650 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X650B */
      val INFINIX_X650B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X650C */
      val INFINIX_X650C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X650D */
      val INFINIX_X650D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6511 */
      val INFINIX_X6511 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6511B */
      val INFINIX_X6511B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6511E */
      val INFINIX_X6511E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6511G */
      val INFINIX_X6511G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6512 */
      val INFINIX_X6512 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6515 */
      val INFINIX_X6515 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6516 */
      val INFINIX_X6516 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6517 */
      val INFINIX_X6517 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X652 */
      val INFINIX_X652 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6525 */
      val INFINIX_X6525 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6525B */
      val INFINIX_X6525B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6525D */
      val INFINIX_X6525D = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6526 */
      val INFINIX_X6526 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6528 */
      val INFINIX_X6528 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X6528B */
      val INFINIX_X6528B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X652A */
      val INFINIX_X652A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X652B */
      val INFINIX_X652B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X652C */
      val INFINIX_X652C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X653 */
      val INFINIX_X653 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6531 */
      val INFINIX_X6531 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6531B */
      val INFINIX_X6531B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6532 */
      val INFINIX_X6532 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6532C */
      val INFINIX_X6532C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X653C */
      val INFINIX_X653C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X655 */
      val INFINIX_X655 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X655C */
      val INFINIX_X655C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X655D */
      val INFINIX_X655D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X655F */
      val INFINIX_X655F = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X656 */
      val INFINIX_X656 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X657 */
      val INFINIX_X657 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X657B */
      val INFINIX_X657B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X657C */
      val INFINIX_X657C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X658B */
      val INFINIX_X658B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X658E */
      val INFINIX_X658E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X659 */
      val INFINIX_X659 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X659B */
      val INFINIX_X659B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X660 */
      val INFINIX_X660 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Infinix Infinix-X660B */
      val INFINIX_X660B = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Infinix Infinix-X660C */
      val INFINIX_X660C = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Infinix Infinix-X662 */
      val INFINIX_X662 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Infinix Infinix-X662B */
      val INFINIX_X662B = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Infinix Infinix-X663 */
      val INFINIX_X663 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X663B */
      val INFINIX_X663B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X663C */
      val INFINIX_X663C = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X665 */
      val INFINIX_X665 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X665B */
      val INFINIX_X665B = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X665C */
      val INFINIX_X665C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X665E */
      val INFINIX_X665E = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X666 */
      val INFINIX_X666 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Infinix Infinix-X668 */
      val INFINIX_X668 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X668C */
      val INFINIX_X668C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X669 */
      val INFINIX_X669 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X669C */
      val INFINIX_X669C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X669D */
      val INFINIX_X669D = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Infinix Infinix-X670 */
      val INFINIX_X670 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X671 */
      val INFINIX_X671 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6710 */
      val INFINIX_X6710 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6711 */
      val INFINIX_X6711 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6716 */
      val INFINIX_X6716 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6716B */
      val INFINIX_X6716B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X671B */
      val INFINIX_X671B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X672 */
      val INFINIX_X672 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6720 */
      val INFINIX_X6720 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6720B */
      val INFINIX_X6720B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6725 */
      val INFINIX_X6725 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Infinix Infinix-X6725B */
      val INFINIX_X6725B = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Infinix Infinix-X6725C */
      val INFINIX_X6725C = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Infinix Infinix-X6725D */
      val INFINIX_X6725D = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Infinix Infinix-X6728 */
      val INFINIX_X6728 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Infinix Infinix-X6731 */
      val INFINIX_X6731 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6731B */
      val INFINIX_X6731B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6739 */
      val INFINIX_X6739 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X675 */
      val INFINIX_X675 = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** Infinix Infinix-X676B */
      val INFINIX_X676B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X676C */
      val INFINIX_X676C = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X677 */
      val INFINIX_X677 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X678B */
      val INFINIX_X678B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X680 */
      val INFINIX_X680 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X680B */
      val INFINIX_X680B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X680C */
      val INFINIX_X680C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X680D */
      val INFINIX_X680D = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X680F */
      val INFINIX_X680F = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6810 */
      val INFINIX_X6810 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6811 */
      val INFINIX_X6811 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6811B */
      val INFINIX_X6811B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6812 */
      val INFINIX_X6812 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6812B */
      val INFINIX_X6812B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6815 */
      val INFINIX_X6815 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6815B */
      val INFINIX_X6815B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6815C */
      val INFINIX_X6815C = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6815D */
      val INFINIX_X6815D = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6816C */
      val INFINIX_X6816C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6816D */
      val INFINIX_X6816D = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6817 */
      val INFINIX_X6817 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6819 */
      val INFINIX_X6819 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6820 */
      val INFINIX_X6820 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6821 */
      val INFINIX_X6821 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Infinix Infinix-X6823 */
      val INFINIX_X6823 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6823C */
      val INFINIX_X6823C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6825 */
      val INFINIX_X6825 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6826 */
      val INFINIX_X6826 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6826B */
      val INFINIX_X6826B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6826C */
      val INFINIX_X6826C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6827 */
      val INFINIX_X6827 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X682B */
      val INFINIX_X682B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X682C */
      val INFINIX_X682C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X683 */
      val INFINIX_X683 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6832 */
      val INFINIX_X6832 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6833B */
      val INFINIX_X6833B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6835 */
      val INFINIX_X6835 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6835B */
      val INFINIX_X6835B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6836 */
      val INFINIX_X6836 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6837 */
      val INFINIX_X6837 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6838 */
      val INFINIX_X6838 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X683B */
      val INFINIX_X683B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X6850B */
      val INFINIX_X6850B = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** Infinix Infinix-X6851 */
      val INFINIX_X6851 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X6851B */
      val INFINIX_X6851B = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X6852 */
      val INFINIX_X6852 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X6853 */
      val INFINIX_X6853 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X6855 */
      val INFINIX_X6855 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** Infinix Infinix-X6856 */
      val INFINIX_X6856 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** Infinix Infinix-X6857 */
      val INFINIX_X6857 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Infinix Infinix-X6857B */
      val INFINIX_X6857B = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Infinix Infinix-X6858 */
      val INFINIX_X6858 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** Infinix Infinix-X6860 */
      val INFINIX_X6860 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X6861 */
      val INFINIX_X6861 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X687 */
      val INFINIX_X687 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6870 */
      val INFINIX_X6870 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** Infinix Infinix-X6871 */
      val INFINIX_X6871 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X6873 */
      val INFINIX_X6873 = "spec:width=1224,height=2720,unit=px,dpi=480"

      /** Infinix Infinix-X6876 */
      val INFINIX_X6876 = "spec:width=1224,height=2720,unit=px,dpi=480"

      /** Infinix Infinix-X687B */
      val INFINIX_X687B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6881 */
      val INFINIX_X6881 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** Infinix Infinix-X6882 */
      val INFINIX_X6882 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6882B */
      val INFINIX_X6882B = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6885 */
      val INFINIX_X6885 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** Infinix Infinix-X6886 */
      val INFINIX_X6886 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** Infinix Infinix-X688B */
      val INFINIX_X688B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X688C */
      val INFINIX_X688C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X689 */
      val INFINIX_X689 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X689B */
      val INFINIX_X689B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X689C */
      val INFINIX_X689C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X689D */
      val INFINIX_X689D = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X689F */
      val INFINIX_X689F = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X690 */
      val INFINIX_X690 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X690B */
      val INFINIX_X690B = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X690C */
      val INFINIX_X690C = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X692 */
      val INFINIX_X692 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Infinix Infinix-X693 */
      val INFINIX_X693 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X695 */
      val INFINIX_X695 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X695C */
      val INFINIX_X695C = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X695D */
      val INFINIX_X695D = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X6962 */
      val INFINIX_X6962 = "spec:width=1080,height=2640,unit=px,dpi=480"

      /** Infinix Infinix-X697 */
      val INFINIX_X697 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix Infinix-X698 */
      val INFINIX_X698 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Infinix longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Infinix samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Infinix X555 */
      val X555 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix X556 */
      val X556 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix X557 */
      val X557 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix X557-Lite */
      val X557_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Infinix X601 */
      val X601 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix X601-LTE */
      val X601_LTE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Infinix X602 */
      val X602 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
